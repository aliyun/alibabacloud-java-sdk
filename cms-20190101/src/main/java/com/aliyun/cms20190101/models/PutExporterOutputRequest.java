// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutExporterOutputRequest extends TeaModel {
    /**
     * <p>The configuration of the data export. The value is a JSONObject string that must contain the following fields:</p>
     * <ul>
     * <li>endpoint: the domain name that corresponds to the data of Log Service (SLS).</li>
     * <li>project: the project.</li>
     * <li>logstore: the Logstore.</li>
     * <li>ak: the AccessKey ID.</li>
     * <li>as: the AccessKey secret.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;endpoint&quot;: &quot;<a href="http://cn-qingdao-share.log.aliyuncs.com">http://cn-qingdao-share.log.aliyuncs.com</a>&quot;, &quot;project&quot;: &quot;exporter&quot;, &quot;logstore&quot;: &quot;exporter&quot;,&quot;ak&quot;: &quot;LTAIp*******&quot;, &quot;userId&quot;: &quot;17754********&quot;, &quot;as&quot;: &quot;TxHwuJ8yAb3AU******&quot;}</p>
     */
    @NameInMap("ConfigJson")
    public String configJson;

    /**
     * <p>The description of the configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>CPU metric export</p>
     */
    @NameInMap("Desc")
    public String desc;

    /**
     * <p>The name of the configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>exporterConfig</p>
     */
    @NameInMap("DestName")
    public String destName;

    /**
     * <p>The product to which the data is exported.</p>
     * 
     * <strong>example:</strong>
     * <p>sls</p>
     */
    @NameInMap("DestType")
    public String destType;

    @NameInMap("RegionId")
    public String regionId;

    public static PutExporterOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        PutExporterOutputRequest self = new PutExporterOutputRequest();
        return TeaModel.build(map, self);
    }

    public PutExporterOutputRequest setConfigJson(String configJson) {
        this.configJson = configJson;
        return this;
    }
    public String getConfigJson() {
        return this.configJson;
    }

    public PutExporterOutputRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public PutExporterOutputRequest setDestName(String destName) {
        this.destName = destName;
        return this;
    }
    public String getDestName() {
        return this.destName;
    }

    public PutExporterOutputRequest setDestType(String destType) {
        this.destType = destType;
        return this;
    }
    public String getDestType() {
        return this.destType;
    }

    public PutExporterOutputRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
