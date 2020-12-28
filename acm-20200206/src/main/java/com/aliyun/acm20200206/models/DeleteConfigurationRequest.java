// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DeleteConfigurationRequest extends TeaModel {
    @NameInMap("DataId")
    public String dataId;

    @NameInMap("Group")
    public String group;

    @NameInMap("NamespaceId")
    public String namespaceId;

    public static DeleteConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigurationRequest self = new DeleteConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteConfigurationRequest setDataId(String dataId) {
        this.dataId = dataId;
        return this;
    }
    public String getDataId() {
        return this.dataId;
    }

    public DeleteConfigurationRequest setGroup(String group) {
        this.group = group;
        return this;
    }
    public String getGroup() {
        return this.group;
    }

    public DeleteConfigurationRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
