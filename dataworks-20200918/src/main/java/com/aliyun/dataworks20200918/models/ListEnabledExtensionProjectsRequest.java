// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks20200918.models;

import com.aliyun.tea.*;

public class ListEnabledExtensionProjectsRequest extends TeaModel {
    @NameInMap("ExtensionCode")
    public String extensionCode;

    public static ListEnabledExtensionProjectsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnabledExtensionProjectsRequest self = new ListEnabledExtensionProjectsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnabledExtensionProjectsRequest setExtensionCode(String extensionCode) {
        this.extensionCode = extensionCode;
        return this;
    }
    public String getExtensionCode() {
        return this.extensionCode;
    }

}
