// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PrometheusInstanceStoreConfig extends TeaModel {
    /**
     * <p>The concurrency per host. If this parameter is not specified, the default value is 2. Valid values: 1 to 8.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("parallelCountPerHost")
    public Integer parallelCountPerHost;

    /**
     * <p>Specifies whether to enable parallel query. If this parameter is not specified, the value is considered as false.</p>
     */
    @NameInMap("parallelEnable")
    public Boolean parallelEnable;

    /**
     * <p>The parallel query mode. Valid values:</p>
     * <ul>
     * <li>auto</li>
     * <li>static</li>
     * </ul>
     * <p>If this parameter is not specified, the default value is auto.</p>
     * 
     * <strong>example:</strong>
     * <p>static</p>
     */
    @NameInMap("parallelMode")
    public String parallelMode;

    /**
     * <p>Specifies whether to enable query cache. If this parameter is not specified, the value is considered as false.</p>
     */
    @NameInMap("queryCacheEnable")
    public Boolean queryCacheEnable;

    /**
     * <p>The global concurrency. If this parameter is not specified, the default value is 8. Valid values: 2 to 64.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("totalParallelCount")
    public Integer totalParallelCount;

    public static PrometheusInstanceStoreConfig build(java.util.Map<String, ?> map) throws Exception {
        PrometheusInstanceStoreConfig self = new PrometheusInstanceStoreConfig();
        return TeaModel.build(map, self);
    }

    public PrometheusInstanceStoreConfig setParallelCountPerHost(Integer parallelCountPerHost) {
        this.parallelCountPerHost = parallelCountPerHost;
        return this;
    }
    public Integer getParallelCountPerHost() {
        return this.parallelCountPerHost;
    }

    public PrometheusInstanceStoreConfig setParallelEnable(Boolean parallelEnable) {
        this.parallelEnable = parallelEnable;
        return this;
    }
    public Boolean getParallelEnable() {
        return this.parallelEnable;
    }

    public PrometheusInstanceStoreConfig setParallelMode(String parallelMode) {
        this.parallelMode = parallelMode;
        return this;
    }
    public String getParallelMode() {
        return this.parallelMode;
    }

    public PrometheusInstanceStoreConfig setQueryCacheEnable(Boolean queryCacheEnable) {
        this.queryCacheEnable = queryCacheEnable;
        return this;
    }
    public Boolean getQueryCacheEnable() {
        return this.queryCacheEnable;
    }

    public PrometheusInstanceStoreConfig setTotalParallelCount(Integer totalParallelCount) {
        this.totalParallelCount = totalParallelCount;
        return this;
    }
    public Integer getTotalParallelCount() {
        return this.totalParallelCount;
    }

}
