// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnConditionIPBInfoRequest extends TeaModel {
    /**
     * <p>The configuration ID. Valid values:</p>
     * <ul>
     * <li>condition_region_config_cn</li>
     * <li>condition_region_config_en</li>
     * <li>condition_isp_config_cn</li>
     * <li>condition_isp_config_en</li>
     * <li>condition_country_config_cn</li>
     * <li>condition_country_config_en</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>condition_region_config_cn</p>
     */
    @NameInMap("DataId")
    public String dataId;

    public static DescribeCdnConditionIPBInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnConditionIPBInfoRequest self = new DescribeCdnConditionIPBInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnConditionIPBInfoRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
