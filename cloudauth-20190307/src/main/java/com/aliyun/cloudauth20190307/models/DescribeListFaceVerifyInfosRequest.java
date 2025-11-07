// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeListFaceVerifyInfosRequest extends TeaModel {
    /**
     * <p>Verification ID.</p>
     * 
     * <strong>example:</strong>
     * <p>shs414a8b392a3a338abe0504c75c056</p>
     */
    @NameInMap("CertifyId")
    public String certifyId;

    /**
     * <p>Query the end time of the verification.</p>
     * 
     * <strong>example:</strong>
     * <p>1760716800000</p>
     */
    @NameInMap("GmtEnd")
    public Long gmtEnd;

    /**
     * <p>Query the start time of the verification.</p>
     * 
     * <strong>example:</strong>
     * <p>1760112000000</p>
     */
    @NameInMap("GmtStart")
    public Long gmtStart;

    /**
     * <p>Pagination parameter: current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Number of items per page for paginated queries. Maximum value: 100, default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Scene ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1000009699</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>Verification status:</p>
     * <ul>
     * <li><strong>1</strong>: Verification passed.</li>
     * <li><strong>2</strong>: Verification failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static DescribeListFaceVerifyInfosRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeListFaceVerifyInfosRequest self = new DescribeListFaceVerifyInfosRequest();
        return TeaModel.build(map, self);
    }

    public DescribeListFaceVerifyInfosRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public DescribeListFaceVerifyInfosRequest setGmtEnd(Long gmtEnd) {
        this.gmtEnd = gmtEnd;
        return this;
    }
    public Long getGmtEnd() {
        return this.gmtEnd;
    }

    public DescribeListFaceVerifyInfosRequest setGmtStart(Long gmtStart) {
        this.gmtStart = gmtStart;
        return this;
    }
    public Long getGmtStart() {
        return this.gmtStart;
    }

    public DescribeListFaceVerifyInfosRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeListFaceVerifyInfosRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeListFaceVerifyInfosRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public DescribeListFaceVerifyInfosRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
