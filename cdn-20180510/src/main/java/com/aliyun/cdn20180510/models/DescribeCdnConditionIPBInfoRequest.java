// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnConditionIPBInfoRequest extends TeaModel {
    /**
     * <p>The configuration ID. Valid values:</p>
     * <br>
     * <p>*   condition_region_config_cn</p>
     * <p>*   condition_region_config_en</p>
     * <p>*   condition_isp_config_cn</p>
     * <p>*   condition_isp_config_en</p>
     * <p>*   condition_country_config_cn</p>
     * <p>*   condition_country_config_en</p>
     * <br>
     * <p>This parameter is required.</p>
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
