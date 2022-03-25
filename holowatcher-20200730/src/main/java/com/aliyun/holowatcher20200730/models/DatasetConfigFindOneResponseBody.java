// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetConfigFindOneResponseBody extends TeaModel {
    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("GmtPublished")
    public String gmtPublished;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Key")
    public String key;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("Type")
    public String type;

    @NameInMap("Value")
    public java.util.Map<String, ?> value;

    public static DatasetConfigFindOneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DatasetConfigFindOneResponseBody self = new DatasetConfigFindOneResponseBody();
        return TeaModel.build(map, self);
    }

    public DatasetConfigFindOneResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DatasetConfigFindOneResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DatasetConfigFindOneResponseBody setGmtPublished(String gmtPublished) {
        this.gmtPublished = gmtPublished;
        return this;
    }
    public String getGmtPublished() {
        return this.gmtPublished;
    }

    public DatasetConfigFindOneResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DatasetConfigFindOneResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DatasetConfigFindOneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DatasetConfigFindOneResponseBody setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public DatasetConfigFindOneResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DatasetConfigFindOneResponseBody setValue(java.util.Map<String, ?> value) {
        this.value = value;
        return this;
    }
    public java.util.Map<String, ?> getValue() {
        return this.value;
    }

}
