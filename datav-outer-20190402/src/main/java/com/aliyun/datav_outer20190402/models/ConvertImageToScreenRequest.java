// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datav_outer20190402.models;

import com.aliyun.tea.*;

public class ConvertImageToScreenRequest extends TeaModel {
    @NameInMap("Product")
    public String product;

    @NameInMap("Version")
    public String version;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("ImageUrl")
    public String imageUrl;

    @NameInMap("VisType")
    public String visType;

    @NameInMap("ScreenName")
    public String screenName;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    @NameInMap("IfBeautified")
    public Boolean ifBeautified;

    public static ConvertImageToScreenRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertImageToScreenRequest self = new ConvertImageToScreenRequest();
        return TeaModel.build(map, self);
    }

    public ConvertImageToScreenRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public ConvertImageToScreenRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public ConvertImageToScreenRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public ConvertImageToScreenRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public ConvertImageToScreenRequest setVisType(String visType) {
        this.visType = visType;
        return this;
    }
    public String getVisType() {
        return this.visType;
    }

    public ConvertImageToScreenRequest setScreenName(String screenName) {
        this.screenName = screenName;
        return this;
    }
    public String getScreenName() {
        return this.screenName;
    }

    public ConvertImageToScreenRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ConvertImageToScreenRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ConvertImageToScreenRequest setIfBeautified(Boolean ifBeautified) {
        this.ifBeautified = ifBeautified;
        return this;
    }
    public Boolean getIfBeautified() {
        return this.ifBeautified;
    }

}
