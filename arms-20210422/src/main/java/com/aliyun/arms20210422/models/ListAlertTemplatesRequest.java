// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class ListAlertTemplatesRequest extends TeaModel {
    @NameInMap("AlertProvider")
    public String alertProvider;

    @NameInMap("Labels")
    public String labels;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Status")
    public Boolean status;

    @NameInMap("TemplateProvider")
    public String templateProvider;

    @NameInMap("Type")
    public String type;

    public static ListAlertTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlertTemplatesRequest self = new ListAlertTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListAlertTemplatesRequest setAlertProvider(String alertProvider) {
        this.alertProvider = alertProvider;
        return this;
    }
    public String getAlertProvider() {
        return this.alertProvider;
    }

    public ListAlertTemplatesRequest setLabels(String labels) {
        this.labels = labels;
        return this;
    }
    public String getLabels() {
        return this.labels;
    }

    public ListAlertTemplatesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListAlertTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListAlertTemplatesRequest setStatus(Boolean status) {
        this.status = status;
        return this;
    }
    public Boolean getStatus() {
        return this.status;
    }

    public ListAlertTemplatesRequest setTemplateProvider(String templateProvider) {
        this.templateProvider = templateProvider;
        return this;
    }
    public String getTemplateProvider() {
        return this.templateProvider;
    }

    public ListAlertTemplatesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
