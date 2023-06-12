// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class LineageEntityVO extends TeaModel {
    @NameInMap("DetailUrl")
    public String detailUrl;

    @NameInMap("Name")
    public String name;

    @NameInMap("ParentName")
    public String parentName;

    @NameInMap("QualifiedName")
    public String qualifiedName;

    public static LineageEntityVO build(java.util.Map<String, ?> map) throws Exception {
        LineageEntityVO self = new LineageEntityVO();
        return TeaModel.build(map, self);
    }

    public LineageEntityVO setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
        return this;
    }
    public String getDetailUrl() {
        return this.detailUrl;
    }

    public LineageEntityVO setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public LineageEntityVO setParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }
    public String getParentName() {
        return this.parentName;
    }

    public LineageEntityVO setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
        return this;
    }
    public String getQualifiedName() {
        return this.qualifiedName;
    }

}
