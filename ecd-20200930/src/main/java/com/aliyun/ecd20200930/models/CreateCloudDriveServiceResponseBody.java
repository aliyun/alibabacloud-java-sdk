// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateCloudDriveServiceResponseBody extends TeaModel {
    /**
     * <p>The ID of the attached cloud disk.</p>
     */
    @NameInMap("CdsId")
    public String cdsId;

    /**
     * <p>The name of the cloud disk that is created in Cloud Drive Service.</p>
     */
    @NameInMap("CdsName")
    public String cdsName;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The maximum capacity of each instance in Cloud Drive Service. Unit: GiB</p>
     */
    @NameInMap("MaxSize")
    public String maxSize;

    @NameInMap("OfficeSiteType")
    public String officeSiteType;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateCloudDriveServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCloudDriveServiceResponseBody self = new CreateCloudDriveServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCloudDriveServiceResponseBody setCdsId(String cdsId) {
        this.cdsId = cdsId;
        return this;
    }
    public String getCdsId() {
        return this.cdsId;
    }

    public CreateCloudDriveServiceResponseBody setCdsName(String cdsName) {
        this.cdsName = cdsName;
        return this;
    }
    public String getCdsName() {
        return this.cdsName;
    }

    public CreateCloudDriveServiceResponseBody setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateCloudDriveServiceResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateCloudDriveServiceResponseBody setMaxSize(String maxSize) {
        this.maxSize = maxSize;
        return this;
    }
    public String getMaxSize() {
        return this.maxSize;
    }

    public CreateCloudDriveServiceResponseBody setOfficeSiteType(String officeSiteType) {
        this.officeSiteType = officeSiteType;
        return this;
    }
    public String getOfficeSiteType() {
        return this.officeSiteType;
    }

    public CreateCloudDriveServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
