// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class CreateLibraryRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Type")
    public String type;

    @NameInMap("Name")
    public String name;

    @NameInMap("LibraryVersion")
    public String libraryVersion;

    @NameInMap("SourceType")
    public String sourceType;

    @NameInMap("SourceLocation")
    public String sourceLocation;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("Properties")
    public String properties;

    public static CreateLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLibraryRequest self = new CreateLibraryRequest();
        return TeaModel.build(map, self);
    }

    public CreateLibraryRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateLibraryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLibraryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateLibraryRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateLibraryRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateLibraryRequest setLibraryVersion(String libraryVersion) {
        this.libraryVersion = libraryVersion;
        return this;
    }
    public String getLibraryVersion() {
        return this.libraryVersion;
    }

    public CreateLibraryRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CreateLibraryRequest setSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
        return this;
    }
    public String getSourceLocation() {
        return this.sourceLocation;
    }

    public CreateLibraryRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public CreateLibraryRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

}
