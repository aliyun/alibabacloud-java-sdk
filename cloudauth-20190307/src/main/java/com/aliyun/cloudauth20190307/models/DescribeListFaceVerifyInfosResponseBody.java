// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeListFaceVerifyInfosResponseBody extends TeaModel {
    /**
     * <p>The list of facial recognition authentication records.</p>
     */
    @NameInMap("FaceVerifyInfos")
    public java.util.List<DescribeListFaceVerifyInfosResponseBodyFaceVerifyInfos> faceVerifyInfos;

    /**
     * <p>The specified page number returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("ItemsPerPage")
    public Integer itemsPerPage;

    /**
     * <p>The current page number for pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1CC27D8E-24BF-5056-B14E-9F26719C9A8D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of authentication records.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    public static DescribeListFaceVerifyInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeListFaceVerifyInfosResponseBody self = new DescribeListFaceVerifyInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeListFaceVerifyInfosResponseBody setFaceVerifyInfos(java.util.List<DescribeListFaceVerifyInfosResponseBodyFaceVerifyInfos> faceVerifyInfos) {
        this.faceVerifyInfos = faceVerifyInfos;
        return this;
    }
    public java.util.List<DescribeListFaceVerifyInfosResponseBodyFaceVerifyInfos> getFaceVerifyInfos() {
        return this.faceVerifyInfos;
    }

    public DescribeListFaceVerifyInfosResponseBody setItemsPerPage(Integer itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
        return this;
    }
    public Integer getItemsPerPage() {
        return this.itemsPerPage;
    }

    public DescribeListFaceVerifyInfosResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeListFaceVerifyInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeListFaceVerifyInfosResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeListFaceVerifyInfosResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static class DescribeListFaceVerifyInfosResponseBodyFaceVerifyInfos extends TeaModel {
        /**
         * <p>The business code.</p>
         * 
         * <strong>example:</strong>
         * <p>CLOUD_FACE</p>
         */
        @NameInMap("BizCode")
        public String bizCode;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>赵四</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The certificate number.</p>
         * 
         * <strong>example:</strong>
         * <p>500382199805086199</p>
         */
        @NameInMap("CertNo")
        public String certNo;

        /**
         * <p>The certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sha8ff58e964152c4c4d21005fb98ecb</p>
         */
        @NameInMap("CertifyId")
        public String certifyId;

        /**
         * <p>The creation time of the facial recognition record.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-02T11:16:06Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1000010145</p>
         */
        @NameInMap("SceneId")
        public Long sceneId;

        /**
         * <p>The authentication status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Authentication passed.</li>
         * <li><strong>2</strong>: Authentication failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Integer status;

        public static DescribeListFaceVerifyInfosResponseBodyFaceVerifyInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeListFaceVerifyInfosResponseBodyFaceVerifyInfos self = new DescribeListFaceVerifyInfosResponseBodyFaceVerifyInfos();
            return TeaModel.build(map, self);
        }

        public DescribeListFaceVerifyInfosResponseBodyFaceVerifyInfos setBizCode(String bizCode) {
            this.bizCode = bizCode;
            return this;
        }
        public String getBizCode() {
            return this.bizCode;
        }

        public DescribeListFaceVerifyInfosResponseBodyFaceVerifyInfos setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeListFaceVerifyInfosResponseBodyFaceVerifyInfos setCertNo(String certNo) {
            this.certNo = certNo;
            return this;
        }
        public String getCertNo() {
            return this.certNo;
        }

        public DescribeListFaceVerifyInfosResponseBodyFaceVerifyInfos setCertifyId(String certifyId) {
            this.certifyId = certifyId;
            return this;
        }
        public String getCertifyId() {
            return this.certifyId;
        }

        public DescribeListFaceVerifyInfosResponseBodyFaceVerifyInfos setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeListFaceVerifyInfosResponseBodyFaceVerifyInfos setSceneId(Long sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public Long getSceneId() {
            return this.sceneId;
        }

        public DescribeListFaceVerifyInfosResponseBodyFaceVerifyInfos setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

    }

}
