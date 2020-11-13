// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class ExtractPedestrianFeatureAttributeRequest extends TeaModel {
    @NameInMap("Mode")
    public String mode;

    @NameInMap("ImageURL")
    public String imageURL;

    @NameInMap("UrlList")
    public java.util.List<ExtractPedestrianFeatureAttributeRequestUrlList> urlList;

    public static ExtractPedestrianFeatureAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ExtractPedestrianFeatureAttributeRequest self = new ExtractPedestrianFeatureAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ExtractPedestrianFeatureAttributeRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public ExtractPedestrianFeatureAttributeRequest setImageURL(String imageURL) {
        this.imageURL = imageURL;
        return this;
    }
    public String getImageURL() {
        return this.imageURL;
    }

    public ExtractPedestrianFeatureAttributeRequest setUrlList(java.util.List<ExtractPedestrianFeatureAttributeRequestUrlList> urlList) {
        this.urlList = urlList;
        return this;
    }
    public java.util.List<ExtractPedestrianFeatureAttributeRequestUrlList> getUrlList() {
        return this.urlList;
    }

    public static class ExtractPedestrianFeatureAttributeRequestUrlList extends TeaModel {
        @NameInMap("Url")
        public String url;

        public static ExtractPedestrianFeatureAttributeRequestUrlList build(java.util.Map<String, ?> map) throws Exception {
            ExtractPedestrianFeatureAttributeRequestUrlList self = new ExtractPedestrianFeatureAttributeRequestUrlList();
            return TeaModel.build(map, self);
        }

        public ExtractPedestrianFeatureAttributeRequestUrlList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
