// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ConfigNetworkRegionBlockRequest extends TeaModel {
    /**
     * <p>The details of the configurations of blocked locations. This parameter is a JSON string. The value consists of the following fields:</p>
     * <br>
     * <p>*   **RegionBlockSwitch**: the status of the Location Blacklist policy. This field is required and must be of the string type. Valid values:</p>
     * <br>
     * <p>    *   **on**: enables the policy.</p>
     * <p>    *   **off**: disables the policy.</p>
     * <br>
     * <p>*   **Countries**: the codes of the countries or areas from which you want to block requests. This field is optional and must be of the array type.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note**For more information, see the **Codes of countries and areas** section of the [Codes of administrative regions in China and codes of countries and areas](https://help.aliyun.com/document_detail/167926.html) topic.</p>
     * <br>
     * <br>
     * <p>*   **Provinces**: the codes of the administrative regions in China from which you want to block requests. This field is optional and must be of the array type.</p>
     * <br>
     * <p>    **</p>
     * <br>
     * <p>    **Note**For more information, see the **Codes of administrative regions in China** section of the [Codes of administrative regions in China and codes of countries and areas](https://help.aliyun.com/document_detail/167926.html) topic.</p>
     * <br>
     * <p>    For example, `[11,12]` specifies Beijing and Tianjin.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Config")
    public String config;

    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>> You can call the [DescribeInstanceIds](https://help.aliyun.com/document_detail/157459.html) operation to query the IDs of all instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static ConfigNetworkRegionBlockRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigNetworkRegionBlockRequest self = new ConfigNetworkRegionBlockRequest();
        return TeaModel.build(map, self);
    }

    public ConfigNetworkRegionBlockRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public ConfigNetworkRegionBlockRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
