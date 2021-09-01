// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class AddUserLibraryByZipShrinkRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("Photo")
    public String photoShrink;

    public static AddUserLibraryByZipShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserLibraryByZipShrinkRequest self = new AddUserLibraryByZipShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddUserLibraryByZipShrinkRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public AddUserLibraryByZipShrinkRequest setPhotoShrink(String photoShrink) {
        this.photoShrink = photoShrink;
        return this;
    }
    public String getPhotoShrink() {
        return this.photoShrink;
    }

}
