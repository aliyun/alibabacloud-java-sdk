// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class BatchDeleteScreensRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("Screens")
    public java.util.List<BatchDeleteScreensRequestScreens> screens;

    public static BatchDeleteScreensRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteScreensRequest self = new BatchDeleteScreensRequest();
        return TeaModel.build(map, self);
    }

    public BatchDeleteScreensRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public BatchDeleteScreensRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public BatchDeleteScreensRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public BatchDeleteScreensRequest setScreens(java.util.List<BatchDeleteScreensRequestScreens> screens) {
        this.screens = screens;
        return this;
    }
    public java.util.List<BatchDeleteScreensRequestScreens> getScreens() {
        return this.screens;
    }

    public static class BatchDeleteScreensRequestScreens extends TeaModel {
        @NameInMap("ScreenId")
        public Integer screenId;

        public static BatchDeleteScreensRequestScreens build(java.util.Map<String, ?> map) throws Exception {
            BatchDeleteScreensRequestScreens self = new BatchDeleteScreensRequestScreens();
            return TeaModel.build(map, self);
        }

        public BatchDeleteScreensRequestScreens setScreenId(Integer screenId) {
            this.screenId = screenId;
            return this;
        }
        public Integer getScreenId() {
            return this.screenId;
        }

    }

}
