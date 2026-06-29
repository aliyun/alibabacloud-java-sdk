// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceAuthorizedProjectsResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of projects.</p>
     */
    @NameInMap("ProjectList")
    public java.util.List<GetDataServiceAuthorizedProjectsResponseBodyProjectList> projectList;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataServiceAuthorizedProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceAuthorizedProjectsResponseBody self = new GetDataServiceAuthorizedProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceAuthorizedProjectsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataServiceAuthorizedProjectsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServiceAuthorizedProjectsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataServiceAuthorizedProjectsResponseBody setProjectList(java.util.List<GetDataServiceAuthorizedProjectsResponseBodyProjectList> projectList) {
        this.projectList = projectList;
        return this;
    }
    public java.util.List<GetDataServiceAuthorizedProjectsResponseBodyProjectList> getProjectList() {
        return this.projectList;
    }

    public GetDataServiceAuthorizedProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceAuthorizedProjectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataServiceAuthorizedProjectsResponseBodyProjectList extends TeaModel {
        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1011</p>
         */
        @NameInMap("ProjectId")
        public Integer projectId;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>The role of the user. Valid values:</p>
         * <ul>
         * <li>1: super administrator</li>
         * <li>2: developer</li>
         * <li>3: application member</li>
         * <li>4: service project administrator</li>
         * <li>5: O&amp;M user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Role")
        public Integer role;

        public static GetDataServiceAuthorizedProjectsResponseBodyProjectList build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceAuthorizedProjectsResponseBodyProjectList self = new GetDataServiceAuthorizedProjectsResponseBodyProjectList();
            return TeaModel.build(map, self);
        }

        public GetDataServiceAuthorizedProjectsResponseBodyProjectList setProjectId(Integer projectId) {
            this.projectId = projectId;
            return this;
        }
        public Integer getProjectId() {
            return this.projectId;
        }

        public GetDataServiceAuthorizedProjectsResponseBodyProjectList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetDataServiceAuthorizedProjectsResponseBodyProjectList setRole(Integer role) {
            this.role = role;
            return this;
        }
        public Integer getRole() {
            return this.role;
        }

    }

}
