// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListDestinationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>iot-2w****</p>
     */
    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Page")
    public Integer page;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>DataPurpose</p>
     */
    @NameInMap("SearchName")
    public String searchName;

    /**
     * <p>The actions of forwarding data to data destinations. Data is processed by using a parser script before the data is forwarded. Valid values:</p>
     * <ul>
     * <li><strong>REPUBLISH</strong>: forwards topic data to an IoT Platform communication topic.</li>
     * <li><strong>AMQP</strong>: forwards topic data to an Advanced Message Queuing Protocol (AMQP) consumer group.</li>
     * <li><strong>DATAHUB</strong>: forwards topic data to Alibaba Cloud DataHub for stream data processing.</li>
     * <li><strong>ONS</strong>: forwards topic data to Message Queue for Apache RocketMQ for message distribution.</li>
     * <li><strong>MNS</strong>: forwards topic data to Message Service (MNS) for message transmission.</li>
     * <li><strong>FC</strong>: forwards topic data to Function Compute for event computing.</li>
     * <li><strong>OTS</strong>: forwards topic data to Tablestore for NoSQL data storage.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[&quot;REPUBLISH&quot;, &quot;OTS&quot;]</p>
     */
    @NameInMap("Types")
    public java.util.List<String> types;

    public static ListDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDestinationRequest self = new ListDestinationRequest();
        return TeaModel.build(map, self);
    }

    public ListDestinationRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public ListDestinationRequest setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListDestinationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDestinationRequest setSearchName(String searchName) {
        this.searchName = searchName;
        return this;
    }
    public String getSearchName() {
        return this.searchName;
    }

    public ListDestinationRequest setTypes(java.util.List<String> types) {
        this.types = types;
        return this;
    }
    public java.util.List<String> getTypes() {
        return this.types;
    }

}
