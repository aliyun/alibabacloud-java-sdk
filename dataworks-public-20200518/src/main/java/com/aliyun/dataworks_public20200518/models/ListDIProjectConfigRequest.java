// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListDIProjectConfigRequest extends TeaModel {
    @NameInMap("DestinationType")
    public String destinationType;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("SourceType")
    public String sourceType;

    public static ListDIProjectConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDIProjectConfigRequest self = new ListDIProjectConfigRequest();
        return TeaModel.build(map, self);
    }

    public ListDIProjectConfigRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public ListDIProjectConfigRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListDIProjectConfigRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
