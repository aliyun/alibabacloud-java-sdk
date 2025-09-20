// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20231229.models;

import com.aliyun.tea.*;

public class GetParseSettingsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cate_cdd11b1b79a74e8bbd675c356a91ee35xxxxxxxx</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    public static GetParseSettingsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetParseSettingsRequest self = new GetParseSettingsRequest();
        return TeaModel.build(map, self);
    }

    public GetParseSettingsRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

}
