// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.documentparseservice20260414.models;

import com.aliyun.tea.*;

public class DocumentParseOnlineApiRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://maas-multimodal.oss-cn-hangzhou.aliyuncs.com/yuhui%2Ftmp%2Fsample500%2Ftmp%2F01e67f7c18d739a47f09d6c6b4a3d478_35.jpg?OSSAccessKeyId=LTAI5tGFE7dDsowkX8eWZMEe&Expires=1779229955&Signature=8sjYEYUHOsqCV11hC2MN%2Bs%2BguSI%3D">https://maas-multimodal.oss-cn-hangzhou.aliyuncs.com/yuhui%2Ftmp%2Fsample500%2Ftmp%2F01e67f7c18d739a47f09d6c6b4a3d478_35.jpg?OSSAccessKeyId=LTAI5tGFE7dDsowkX8eWZMEe&amp;Expires=1779229955&amp;Signature=8sjYEYUHOsqCV11hC2MN%2Bs%2BguSI%3D</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Type")
    public Long type;

    public static DocumentParseOnlineApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DocumentParseOnlineApiRequest self = new DocumentParseOnlineApiRequest();
        return TeaModel.build(map, self);
    }

    public DocumentParseOnlineApiRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public DocumentParseOnlineApiRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
