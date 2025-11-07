// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeListFaceVerifyDataRequest extends TeaModel {
    /**
     * <p>End time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1760630399999</p>
     */
    @NameInMap("GmtEnd")
    public Long gmtEnd;

    /**
     * <p>Start time of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>1760025600000</p>
     */
    @NameInMap("GmtStart")
    public Long gmtStart;

    /**
     * <p>Product Code, currently deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p>Liveness</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Scene ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1000000339</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    public static DescribeListFaceVerifyDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeListFaceVerifyDataRequest self = new DescribeListFaceVerifyDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeListFaceVerifyDataRequest setGmtEnd(Long gmtEnd) {
        this.gmtEnd = gmtEnd;
        return this;
    }
    public Long getGmtEnd() {
        return this.gmtEnd;
    }

    public DescribeListFaceVerifyDataRequest setGmtStart(Long gmtStart) {
        this.gmtStart = gmtStart;
        return this;
    }
    public Long getGmtStart() {
        return this.gmtStart;
    }

    public DescribeListFaceVerifyDataRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeListFaceVerifyDataRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
