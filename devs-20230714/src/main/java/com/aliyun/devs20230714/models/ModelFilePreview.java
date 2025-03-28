// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class ModelFilePreview extends TeaModel {
    @NameInMap("content")
    public String content;

    @NameInMap("hash")
    public String hash;

    @NameInMap("isCompressedImage")
    public Boolean isCompressedImage;

    @NameInMap("isDir")
    public Boolean isDir;

    @NameInMap("name")
    public String name;

    @NameInMap("path")
    public String path;

    @NameInMap("size")
    public Long size;

    @NameInMap("unpreviewable")
    public Boolean unpreviewable;

    public static ModelFilePreview build(java.util.Map<String, ?> map) throws Exception {
        ModelFilePreview self = new ModelFilePreview();
        return TeaModel.build(map, self);
    }

    public ModelFilePreview setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public ModelFilePreview setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public ModelFilePreview setIsCompressedImage(Boolean isCompressedImage) {
        this.isCompressedImage = isCompressedImage;
        return this;
    }
    public Boolean getIsCompressedImage() {
        return this.isCompressedImage;
    }

    public ModelFilePreview setIsDir(Boolean isDir) {
        this.isDir = isDir;
        return this;
    }
    public Boolean getIsDir() {
        return this.isDir;
    }

    public ModelFilePreview setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModelFilePreview setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ModelFilePreview setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

    public ModelFilePreview setUnpreviewable(Boolean unpreviewable) {
        this.unpreviewable = unpreviewable;
        return this;
    }
    public Boolean getUnpreviewable() {
        return this.unpreviewable;
    }

}
