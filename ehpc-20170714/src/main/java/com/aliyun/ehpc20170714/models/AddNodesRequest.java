// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20170714.models;

import com.aliyun.tea.*;

public class AddNodesRequest extends TeaModel {
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ComputeSpotPriceLimit")
    public String computeSpotPriceLimit;

    @NameInMap("ComputeSpotStrategy")
    public String computeSpotStrategy;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("ImageId")
    public String imageId;

    @NameInMap("ImageOwnerAlias")
    public String imageOwnerAlias;

    public static AddNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        AddNodesRequest self = new AddNodesRequest();
        return TeaModel.build(map, self);
    }

    public AddNodesRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public AddNodesRequest setComputeSpotPriceLimit(String computeSpotPriceLimit) {
        this.computeSpotPriceLimit = computeSpotPriceLimit;
        return this;
    }
    public String getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    public AddNodesRequest setComputeSpotStrategy(String computeSpotStrategy) {
        this.computeSpotStrategy = computeSpotStrategy;
        return this;
    }
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    public AddNodesRequest setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public AddNodesRequest setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public AddNodesRequest setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

}
