// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class ListVersionsOutput extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>FORWARD</p>
     */
    @NameInMap("direction")
    public String direction;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("versions")
    public java.util.List<Version> versions;

    public static ListVersionsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListVersionsOutput self = new ListVersionsOutput();
        return TeaModel.build(map, self);
    }

    public ListVersionsOutput setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public ListVersionsOutput setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListVersionsOutput setVersions(java.util.List<Version> versions) {
        this.versions = versions;
        return this;
    }
    public java.util.List<Version> getVersions() {
        return this.versions;
    }

}
