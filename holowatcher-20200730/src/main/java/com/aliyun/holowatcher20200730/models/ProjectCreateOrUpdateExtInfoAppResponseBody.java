// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectCreateOrUpdateExtInfoAppResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ExtInfo")
    public ProjectCreateOrUpdateExtInfoAppResponseBodyExtInfo extInfo;

    @NameInMap("Message")
    public String message;

    @NameInMap("ProjectId")
    public Long projectId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ProjectCreateOrUpdateExtInfoAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProjectCreateOrUpdateExtInfoAppResponseBody self = new ProjectCreateOrUpdateExtInfoAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ProjectCreateOrUpdateExtInfoAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ProjectCreateOrUpdateExtInfoAppResponseBody setExtInfo(ProjectCreateOrUpdateExtInfoAppResponseBodyExtInfo extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public ProjectCreateOrUpdateExtInfoAppResponseBodyExtInfo getExtInfo() {
        return this.extInfo;
    }

    public ProjectCreateOrUpdateExtInfoAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ProjectCreateOrUpdateExtInfoAppResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ProjectCreateOrUpdateExtInfoAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ProjectCreateOrUpdateExtInfoAppResponseBodyExtInfo extends TeaModel {
        @NameInMap("FLOORPLANAREA")
        public String FLOORPLANAREA;

        @NameInMap("ONLINEDNS")
        public String ONLINEDNS;

        @NameInMap("STATUS")
        public String STATUS;

        public static ProjectCreateOrUpdateExtInfoAppResponseBodyExtInfo build(java.util.Map<String, ?> map) throws Exception {
            ProjectCreateOrUpdateExtInfoAppResponseBodyExtInfo self = new ProjectCreateOrUpdateExtInfoAppResponseBodyExtInfo();
            return TeaModel.build(map, self);
        }

        public ProjectCreateOrUpdateExtInfoAppResponseBodyExtInfo setFLOORPLANAREA(String FLOORPLANAREA) {
            this.FLOORPLANAREA = FLOORPLANAREA;
            return this;
        }
        public String getFLOORPLANAREA() {
            return this.FLOORPLANAREA;
        }

        public ProjectCreateOrUpdateExtInfoAppResponseBodyExtInfo setONLINEDNS(String ONLINEDNS) {
            this.ONLINEDNS = ONLINEDNS;
            return this;
        }
        public String getONLINEDNS() {
            return this.ONLINEDNS;
        }

        public ProjectCreateOrUpdateExtInfoAppResponseBodyExtInfo setSTATUS(String STATUS) {
            this.STATUS = STATUS;
            return this;
        }
        public String getSTATUS() {
            return this.STATUS;
        }

    }

}
