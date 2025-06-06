// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class DefaultBuilderConfig extends TeaModel {
    @NameInMap("cache")
    public BuildCacheConfig cache;

    @NameInMap("languages")
    public java.util.List<String> languages;

    /**
     * <strong>example:</strong>
     * <p>./src</p>
     */
    @NameInMap("rootPath")
    public String rootPath;

    @NameInMap("steps")
    public java.util.List<?> steps;

    public static DefaultBuilderConfig build(java.util.Map<String, ?> map) throws Exception {
        DefaultBuilderConfig self = new DefaultBuilderConfig();
        return TeaModel.build(map, self);
    }

    public DefaultBuilderConfig setCache(BuildCacheConfig cache) {
        this.cache = cache;
        return this;
    }
    public BuildCacheConfig getCache() {
        return this.cache;
    }

    public DefaultBuilderConfig setLanguages(java.util.List<String> languages) {
        this.languages = languages;
        return this;
    }
    public java.util.List<String> getLanguages() {
        return this.languages;
    }

    public DefaultBuilderConfig setRootPath(String rootPath) {
        this.rootPath = rootPath;
        return this;
    }
    public String getRootPath() {
        return this.rootPath;
    }

    public DefaultBuilderConfig setSteps(java.util.List<?> steps) {
        this.steps = steps;
        return this;
    }
    public java.util.List<?> getSteps() {
        return this.steps;
    }

}
