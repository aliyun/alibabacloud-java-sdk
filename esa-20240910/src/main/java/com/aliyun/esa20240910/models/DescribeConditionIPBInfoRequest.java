// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DescribeConditionIPBInfoRequest extends TeaModel {
    /**
     * <p>The configuration ID. Valid values:</p>
     * <ul>
     * <li>condition_region_config_cn: provides a mapping list of region Chinese names and their corresponding codes.</li>
     * <li>condition_region_config_en: provides a mapping list of region English names and their corresponding codes.</li>
     * <li>condition_isp_config_cn: provides a mapping list of ISP Chinese names and their corresponding codes.</li>
     * <li>condition_isp_config_en: provides a mapping list of ISP English names and their corresponding codes.</li>
     * <li>condition_country_config_cn: provides a mapping list of country Chinese names and their corresponding codes.</li>
     * <li>condition_country_config_en: provides a mapping list of country English names and their corresponding codes.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>condition_region_config_cn</p>
     */
    @NameInMap("DataId")
    public String dataId;

    public static DescribeConditionIPBInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeConditionIPBInfoRequest self = new DescribeConditionIPBInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeConditionIPBInfoRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

}
