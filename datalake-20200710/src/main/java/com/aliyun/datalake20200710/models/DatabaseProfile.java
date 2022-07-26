// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class DatabaseProfile extends TeaModel {
    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("FileCnt")
    public Long fileCnt;

    @NameInMap("FileSize")
    public Long fileSize;

    @NameInMap("Location")
    public String location;

    @NameInMap("Name")
    public String name;

    public static DatabaseProfile build(java.util.Map<String, ?> map) throws Exception {
        DatabaseProfile self = new DatabaseProfile();
        return TeaModel.build(map, self);
    }

    public DatabaseProfile setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public DatabaseProfile setFileCnt(Long fileCnt) {
        this.fileCnt = fileCnt;
        return this;
    }
    public Long getFileCnt() {
        return this.fileCnt;
    }

    public DatabaseProfile setFileSize(Long fileSize) {
        this.fileSize = fileSize;
        return this;
    }
    public Long getFileSize() {
        return this.fileSize;
    }

    public DatabaseProfile setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DatabaseProfile setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
