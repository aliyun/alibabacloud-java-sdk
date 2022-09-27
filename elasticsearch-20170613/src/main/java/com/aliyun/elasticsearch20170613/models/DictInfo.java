// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DictInfo extends TeaModel {
    @NameInMap("fileSize")
    public Long fileSize;

    @NameInMap("name")
    public String name;

    @NameInMap("sourceType")
    public String sourceType;

    @NameInMap("type")
    public String type;

    public static DictInfo build(java.util.Map<String, ?> map) throws Exception {
        DictInfo self = new DictInfo();
        return TeaModel.build(map, self);
    }

    public DictInfo setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public DictInfo setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DictInfo setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public DictInfo setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
