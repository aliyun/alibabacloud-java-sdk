// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class MigrateApplicationRequest extends TeaModel {
    /**
     * <p>appIds</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;b72c0ed4-a69f-4872-b4c6-def5555bfd3e,a72c0ed4-a69f-4872-b4c6-def5555bfd3e&quot;</p>
     */
    @NameInMap("appIds")
    public String appIds;

    /**
     * <p>The operation command. Valid values:</p>
     * <ul>
     * <li>export: export</li>
     * <li>import: import</li>
     * <li>clone: clone</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>export</p>
     */
    @NameInMap("cmd")
    public String cmd;

    /**
     * <p>Specifies whether to export the application binary. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>{withBinary:true}</p>
     */
    @NameInMap("config")
    public String config;

    /**
     * <p>The row data of the imported application, which is sourced from the JSON file of the exported application.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;job_id&quot;:&quot;b72c0ed4-a69f-4872-b4c6-def5555bfd3e&quot;,&quot;app_info&quot;:&quot;xxxx&quot;</p>
     */
    @NameInMap("rawData")
    public String rawData;

    /**
     * <p>regionId</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static MigrateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        MigrateApplicationRequest self = new MigrateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public MigrateApplicationRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public MigrateApplicationRequest setCmd(String cmd) {
        this.cmd = cmd;
        return this;
    }
    public String getCmd() {
        return this.cmd;
    }

    public MigrateApplicationRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public MigrateApplicationRequest setRawData(String rawData) {
        this.rawData = rawData;
        return this;
    }
    public String getRawData() {
        return this.rawData;
    }

    public MigrateApplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
