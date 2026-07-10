// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeCloudauthstSceneListResponseBody extends TeaModel {
    /**
     * <p>The list of scenarios.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeCloudauthstSceneListResponseBodyItems> items;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEC88747-2F3E-539E-91A6-84E321CAA12B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCloudauthstSceneListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudauthstSceneListResponseBody self = new DescribeCloudauthstSceneListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudauthstSceneListResponseBody setItems(java.util.List<DescribeCloudauthstSceneListResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeCloudauthstSceneListResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeCloudauthstSceneListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCloudauthstSceneListResponseBodyItems extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-04 19:56:04</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-04 19:56:04</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The Alibaba Cloud Marketplace commodity code.</p>
         * 
         * <strong>example:</strong>
         * <p>SMART_VERIFY</p>
         */
        @NameInMap("ProductCode")
        public String productCode;

        /**
         * <p>The product name.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("ProductName")
        public String productName;

        /**
         * <p>The scenario ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20**40</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <p>The scenario name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试场景</p>
         */
        @NameInMap("SceneName")
        public String sceneName;

        /**
         * <p>Specifies whether to deliver files generated during authentication to the customer\&quot;s OSS. Valid values:</p>
         * <ul>
         * <li><strong>Y</strong>: Enabled.</li>
         * <li><strong>N</strong>: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>N</p>
         */
        @NameInMap("StoreImage")
        public String storeImage;

        public static DescribeCloudauthstSceneListResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudauthstSceneListResponseBodyItems self = new DescribeCloudauthstSceneListResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeCloudauthstSceneListResponseBodyItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeCloudauthstSceneListResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeCloudauthstSceneListResponseBodyItems setProductCode(String productCode) {
            this.productCode = productCode;
            return this;
        }
        public String getProductCode() {
            return this.productCode;
        }

        public DescribeCloudauthstSceneListResponseBodyItems setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public DescribeCloudauthstSceneListResponseBodyItems setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public DescribeCloudauthstSceneListResponseBodyItems setSceneName(String sceneName) {
            this.sceneName = sceneName;
            return this;
        }
        public String getSceneName() {
            return this.sceneName;
        }

        public DescribeCloudauthstSceneListResponseBodyItems setStoreImage(String storeImage) {
            this.storeImage = storeImage;
            return this;
        }
        public String getStoreImage() {
            return this.storeImage;
        }

    }

}
