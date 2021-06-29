// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class SearchFaceRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ProbabilityThreshold")
    public Float probabilityThreshold;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("Content")
    public String content;

    public static SearchFaceRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchFaceRequest self = new SearchFaceRequest();
        return TeaModel.build(map, self);
    }

    public SearchFaceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SearchFaceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SearchFaceRequest setProbabilityThreshold(Float probabilityThreshold) {
        this.probabilityThreshold = probabilityThreshold;
        return this;
    }
    public Float getProbabilityThreshold() {
        return this.probabilityThreshold;
    }

    public SearchFaceRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public SearchFaceRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public SearchFaceRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

}
