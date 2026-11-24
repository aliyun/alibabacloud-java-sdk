// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchDeployHttpApiRoutesRequest extends TeaModel {
    /**
     * <p>Specifies whether to publish routes asynchronously. Default value: true. If set to true, the acceptance results of the routes are returned. If set to false, the system waits for the batch processing to complete and returns the final results and statistics for each route.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("async")
    public Boolean async;

    /**
     * <p>Specifies whether to publish all routes visible to the current user under the API. Default value: false. If you set this parameter to true, all visible routes are published and the routeIds parameter is ignored.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("deployAll")
    public Boolean deployAll;

    /**
     * <p>The list of route IDs to publish. If deployAll is omitted or set to false, at least one route ID must be provided. If any route does not exist or belongs to another API, the entire batch request is rejected.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;hr-example001&quot;,&quot;hr-example002&quot;]</p>
     */
    @NameInMap("routeIds")
    public java.util.List<String> routeIds;

    public static BatchDeployHttpApiRoutesRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeployHttpApiRoutesRequest self = new BatchDeployHttpApiRoutesRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeployHttpApiRoutesRequest setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public BatchDeployHttpApiRoutesRequest setDeployAll(Boolean deployAll) {
        this.deployAll = deployAll;
        return this;
    }
    public Boolean getDeployAll() {
        return this.deployAll;
    }

    public BatchDeployHttpApiRoutesRequest setRouteIds(java.util.List<String> routeIds) {
        this.routeIds = routeIds;
        return this;
    }
    public java.util.List<String> getRouteIds() {
        return this.routeIds;
    }

}
