// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ModelFile extends TeaModel {
    @NameInMap("isDir")
    public Boolean isDir;

    @NameInMap("modeTime")
    public Long modeTime;

    @NameInMap("name")
    public String name;

    @NameInMap("path")
    public String path;

    @NameInMap("size")
    public Long size;

    public static ModelFile build(java.util.Map<String, ?> map) throws Exception {
        ModelFile self = new ModelFile();
        return TeaModel.build(map, self);
    }

    public ModelFile setIsDir(Boolean isDir) {
        this.isDir = isDir;
        return this;
    }
    public Boolean getIsDir() {
        return this.isDir;
    }

    public ModelFile setModeTime(Long modeTime) {
        this.modeTime = modeTime;
        return this;
    }
    public Long getModeTime() {
        return this.modeTime;
    }

    public ModelFile setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelFile setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ModelFile setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
