// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class DatasetConfigUpdateOneResponseBody extends TeaModel {
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

    public static DatasetConfigUpdateOneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DatasetConfigUpdateOneResponseBody self = new DatasetConfigUpdateOneResponseBody();
        return TeaModel.build(map, self);
    }

    public DatasetConfigUpdateOneResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public DatasetConfigUpdateOneResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DatasetConfigUpdateOneResponseBody setGmtPublished(String gmtPublished) {
        this.gmtPublished = gmtPublished;
        return this;
    }
    public String getGmtPublished() {
        return this.gmtPublished;
    }

    public DatasetConfigUpdateOneResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DatasetConfigUpdateOneResponseBody setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DatasetConfigUpdateOneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DatasetConfigUpdateOneResponseBody setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public DatasetConfigUpdateOneResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DatasetConfigUpdateOneResponseBody setValue(java.util.Map<String, ?> value) {
        this.value = value;
        return this;
    }
    public java.util.Map<String, ?> getValue() {
        return this.value;
    }

}
