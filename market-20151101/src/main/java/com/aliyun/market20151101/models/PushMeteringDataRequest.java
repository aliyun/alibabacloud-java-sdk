// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class PushMeteringDataRequest extends TeaModel {
    /**
     * <p>The metric description in the example is as follows:</p>
     * <ul>
     * <li>InstanceId: instance ID of the Alibaba Cloud Marketplace instance. The parameter type is String.</li>
     * <li>StartTime: the start time of the metering period. Unit: seconds. The value is a UNIX timestamp, such as 1723771200. The parameter type is Long.</li>
     * <li>EndTime: the end time of the metering period. Unit: seconds. The value is a UNIX timestamp, such as 1723771800. The parameter type is Long.</li>
     * <li>Entities: the metering entity objects. The parameter type is List<Map>.<ul>
     * <li><p>Key: the name of the metering item property. The parameter type is String.</p>
     * <ul>
     * <li><p>Frequency: the number of uses (times).</p>
     * </li>
     * <li><p>Period: the usage duration in hours (seconds).
     *    Note: The unit of duration in the request parameter is seconds, while the billing unit is hours. Therefore, the duration is transformed to hours during billing. For example, if the pushed usage for 19:00 to 20:00 is 1800 and the billing price is 1 CNY/hour, the fee for this period billed hourly is 1800 / 3600 x 1 = 0.5 CNY. If the fee is a decimal, two decimal places are retained, and the excess is discarded.</p>
     * </li>
     * <li><p>Storage: the used storage space (bytes).</p>
     * </li>
     * </ul>
     * <p>   Note: The unit in the request parameter is bytes, while the billing unit is MB. Therefore, the value is transformed to MB during billing. For example, if the pushed usage for 19:00 to 20:00 is 524288 and the billing price is 1 CNY/MB, the fee for this period billed hourly is 524288 / 1024 / 1024 x 1 = 0.5 CNY. If the fee is a decimal, two decimal places are retained, and the excess is discarded.</p>
     * <ul>
     * <li>NetworkOut: the outbound traffic used (bits).</li>
     * </ul>
     * <p>   Note: The unit in the request parameter is bits, while the billing unit is Mbit. Therefore, the value is transformed to Mbit during billing. For example, if the pushed usage for 19:00 to 20:00 is 524288 and the billing price is 1 CNY/Mbit, the fee for this period billed hourly is 524288 / 1024 / 1024 x 1 = 0.5 CNY. If the fee is a decimal, two decimal places are retained, and the excess is discarded.</p>
     * <ul>
     * <li>NetworkIn: the inbound traffic used (bits).</li>
     * </ul>
     * <p>   Note: The unit in the request parameter is bits, while the billing unit is Mbit. Therefore, the value is transformed to Mbit during billing. For example, if the pushed usage for 19:00 to 20:00 is 524288 and the billing price is 1 CNY/Mbit, the fee for this period billed hourly is 524288 / 1024 / 1024 x 1 = 0.5 CNY. If the fee is a decimal, two decimal places are retained, and the excess is discarded.</p>
     * <ul>
     * <li>Character: the number of characters.</li>
     * <li>DailyActiveUser: the number of daily active users (DAU).</li>
     * <li>PeriodMin: the usage duration in minutes (minutes).</li>
     * <li>VirtualCpu: the number of virtual CPU cores.</li>
     * <li>Unit: the number of units.</li>
     * <li>Memory: the memory size (GB).</li>
     * <li>KTokens: the number of tokens used (tokens).
     *    Note: The unit of KTokens in the request parameter is tokens, and it does not need to be transformed to thousands of tokens. However, the billing unit is thousands of tokens. Therefore, the token value in the pushed metering parameter is transformed to thousands of tokens during billing. For example, if the pushed usage for 19:00 to 20:00 is 1500 tokens, example: {&quot;Key&quot;:&quot;KTokens&quot;,&quot;Value&quot;:&quot;1500&quot;,&quot;meteringAssit&quot;:&quot;cmapi00071246-KTokens-1&quot;}, and the billing price is 1 CNY per thousand tokens, the fee for this period billed hourly is 1500 / 1000 x 1 = 1.5 CNY. If the fee is a decimal, two decimal places are retained, and the excess is discarded.</li>
     * <li>Suit: the number of suites. Note that the value passed in the parameter is the number of suites.</li>
     * <li>StorageGigaByte: the storage space in GB. Note that the unit of the value directly passed in the parameter is GB, and it does not need to be transformed to bytes or other units.</li>
     * </ul>
     * </li>
     * <li><p>Value: the metering value (value &gt;= 0). The parameter type is Integer.</p>
     * </li>
     * <li><p>meteringAssit: instance ID of the multi-dimensional metering item. The parameter type is String. You can view this billing item ID in the product publish backend. Billing items such as Frequency have this value whether there is one or more. When pushing metering data for newly published products, you must pass this parameter.</p>
     * </li>
     * <li><p>SerialNo: specific to large model invoke scenarios. When it is an HTTP invoke, the Settings is requestId. When it is a WebSocket invoke, the Settings is the UID of a single node. This parameter needs to be passed only when the product is billed by the minute. It is not required in other cases.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p><strong>Note</strong>:</p>
     * <ul>
     * <li>The multi-dimensional metering capability allows multiple billing items such as Frequency (times), Period (usage duration), and PeriodMin to be configured when publishing a product. For example, a product can have multiple PeriodMin billing items, and each PeriodMin billing item generates a unique ID as the identity of the billing item. This billing item is generated when the product is published, and the format is such as (cmapi00060317-PeriodMin-3, cmapi00060317-PeriodMin-4). When pushing metering data, you need to pass the above ID to perform the corresponding billing deduction. The format of the metering data pushed for newly published products is as follows:</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>When pushing data hourly or daily:
     * [{&quot;InstanceId&quot;:&quot;1000001&quot;,&quot;StartTime&quot;:&quot;100000000&quot;,&quot;EndTime&quot;:&quot;100000010&quot;,&quot;Entities&quot;:[{&quot;Key&quot;:&quot;PeriodMin&quot;,&quot;Value&quot;:&quot;96&quot;,&quot;meteringAssit&quot;:&quot;cmapi00060317-PeriodMin-4&quot;}]}]</p>
     * <p>When pushing metering data in real time in LLM scenarios:
     * [{&quot;InstanceId&quot;:&quot;1000001&quot;,&quot;SerialNo&quot;:&quot;210f470417561055092582279ea052&quot;,&quot;StartTime&quot;:&quot;100000000&quot;,&quot;EndTime&quot;:&quot;100000010&quot;,&quot;Entities&quot;:[{&quot;Key&quot;:&quot;PeriodMin&quot;,&quot;Value&quot;:&quot;96&quot;,&quot;meteringAssit&quot;:&quot;cmapi00060317-PeriodMin-4&quot;}]}]</p>
     */
    @NameInMap("Metering")
    public String metering;

    public static PushMeteringDataRequest build(java.util.Map<String, ?> map) throws Exception {
        PushMeteringDataRequest self = new PushMeteringDataRequest();
        return TeaModel.build(map, self);
    }

    public PushMeteringDataRequest setMetering(String metering) {
        this.metering = metering;
        return this;
    }
    public String getMetering() {
        return this.metering;
    }

}
