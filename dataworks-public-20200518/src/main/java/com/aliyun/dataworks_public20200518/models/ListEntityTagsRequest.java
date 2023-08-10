// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListEntityTagsRequest extends TeaModel {
    @NameInMap("QualifiedName")
    public String qualifiedName;

    public static ListEntityTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEntityTagsRequest self = new ListEntityTagsRequest();
        return TeaModel.build(map, self);
    }

    public ListEntityTagsRequest setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

}
