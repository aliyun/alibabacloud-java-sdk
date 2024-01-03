// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class UpdateSolutionInstanceAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SolutionInstanceId")
    public String solutionInstanceId;

    public static UpdateSolutionInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSolutionInstanceAttributeRequest self = new UpdateSolutionInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSolutionInstanceAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateSolutionInstanceAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSolutionInstanceAttributeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateSolutionInstanceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSolutionInstanceAttributeRequest setSolutionInstanceId(String solutionInstanceId) {
        this.solutionInstanceId = solutionInstanceId;
        return this;
    }
    public String getSolutionInstanceId() {
        return this.solutionInstanceId;
    }

}
