// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lmztest20100113.models;

import com.aliyun.tea.*;

public class GetProductComponentDetailRequest extends TeaModel {
    @NameInMap("uid")
    public String uid;

    @NameInMap("versionUID")
    public String versionUID;

    @NameInMap("productComponentVersionRelationUID")
    public String productComponentVersionRelationUID;

    @NameInMap("testField")
    public String testField;

    @NameInMap("TestF1")
    public String testF1;

    @NameInMap("TestRelease")
    public String testRelease;

    @NameInMap("testField2")
    public String testField2;

    public static GetProductComponentDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductComponentDetailRequest self = new GetProductComponentDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetProductComponentDetailRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public GetProductComponentDetailRequest setVersionUID(String versionUID) {
        this.versionUID = versionUID;
        return this;
    }
    public String getVersionUID() {
        return this.versionUID;
    }

    public GetProductComponentDetailRequest setProductComponentVersionRelationUID(String productComponentVersionRelationUID) {
        this.productComponentVersionRelationUID = productComponentVersionRelationUID;
        return this;
    }
    public String getProductComponentVersionRelationUID() {
        return this.productComponentVersionRelationUID;
    }

    public GetProductComponentDetailRequest setTestField(String testField) {
        this.testField = testField;
        return this;
    }
    public String getTestField() {
        return this.testField;
    }

    public GetProductComponentDetailRequest setTestF1(String testF1) {
        this.testF1 = testF1;
        return this;
    }
    public String getTestF1() {
        return this.testF1;
    }

    public GetProductComponentDetailRequest setTestRelease(String testRelease) {
        this.testRelease = testRelease;
        return this;
    }
    public String getTestRelease() {
        return this.testRelease;
    }

    public GetProductComponentDetailRequest setTestField2(String testField2) {
        this.testField2 = testField2;
        return this;
    }
    public String getTestField2() {
        return this.testField2;
    }

}
