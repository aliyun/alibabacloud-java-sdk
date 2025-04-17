// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class ListUserConfigsRequest extends TeaModel {
    /**
     * <p>The category. Currently, only DataPrivacyConfig is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>DataPrivacyConfig</p>
     */
    @NameInMap("CategoryNames")
    public String categoryNames;

    /**
     * <p>The configuration item keys. Currently, only customizePAIAssumedRole is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>customizePAIAssumedRole</p>
     */
    @NameInMap("ConfigKeys")
    public String configKeys;

    public static ListUserConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserConfigsRequest self = new ListUserConfigsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserConfigsRequest setCategoryNames(String categoryNames) {
        this.categoryNames = categoryNames;
        return this;
    }
    public String getCategoryNames() {
        return this.categoryNames;
    }

    public ListUserConfigsRequest setConfigKeys(String configKeys) {
        this.configKeys = configKeys;
        return this;
    }
    public String getConfigKeys() {
        return this.configKeys;
    }

}
