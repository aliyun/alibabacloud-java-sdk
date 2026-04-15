// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentparseservice20260414.models;

import com.aliyun.tea.*;

public class DocumentParseTestApiRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1x2xCAxz1gK0jSZSgXXavwpXa-3541-662.png">https://img.alicdn.com/tfs/TB1x2xCAxz1gK0jSZSgXXavwpXa-3541-662.png</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <strong>example:</strong>
     * <p>MAIN_FLOW</p>
     */
    @NameInMap("Type")
    public Long type;

    public static DocumentParseTestApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DocumentParseTestApiRequest self = new DocumentParseTestApiRequest();
        return TeaModel.build(map, self);
    }

    public DocumentParseTestApiRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DocumentParseTestApiRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
