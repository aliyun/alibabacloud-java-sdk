// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class AddUserLibraryByZipRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    @NameInMap("Photo")
    public java.util.Map<String, ?> photo;

    public static AddUserLibraryByZipRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserLibraryByZipRequest self = new AddUserLibraryByZipRequest();
        return TeaModel.build(map, self);
    }

    public AddUserLibraryByZipRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

    public AddUserLibraryByZipRequest setPhoto(java.util.Map<String, ?> photo) {
        this.photo = photo;
        return this;
    }
    public java.util.Map<String, ?> getPhoto() {
        return this.photo;
    }

}
