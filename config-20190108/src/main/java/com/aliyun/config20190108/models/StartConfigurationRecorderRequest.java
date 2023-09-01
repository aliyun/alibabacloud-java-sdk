// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20190108.models;

import com.aliyun.tea.*;

public class StartConfigurationRecorderRequest extends TeaModel {
    /**
     * <p>Specifies whether to upgrade Cloud Config for Enterprise. Default value: false. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     * <br>
     * <p>>  Cloud Config for Enterprise is upgraded to the account group feature. For more information, see [Announcement: Enterprise Edition Cloud Config Upgrade to Account Group](~~213433~~).</p>
     */
    @NameInMap("EnterpriseEdition")
    public Boolean enterpriseEdition;

    public static StartConfigurationRecorderRequest build(java.util.Map<String, ?> map) throws Exception {
        StartConfigurationRecorderRequest self = new StartConfigurationRecorderRequest();
        return TeaModel.build(map, self);
    }

    public StartConfigurationRecorderRequest setEnterpriseEdition(Boolean enterpriseEdition) {
        this.enterpriseEdition = enterpriseEdition;
        return this;
    }
    public Boolean getEnterpriseEdition() {
        return this.enterpriseEdition;
    }

}
