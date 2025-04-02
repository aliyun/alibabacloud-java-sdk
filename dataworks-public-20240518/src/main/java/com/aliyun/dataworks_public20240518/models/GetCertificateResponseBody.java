// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetCertificateResponseBody extends TeaModel {
    /**
     * <p>The details of the certificate file.</p>
     */
    @NameInMap("Certificate")
    public GetCertificateResponseBodyCertificate certificate;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0000-ABCD-EFG****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCertificateResponseBody self = new GetCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCertificateResponseBody setCertificate(GetCertificateResponseBodyCertificate certificate) {
        this.certificate = certificate;
        return this;
    }
    public GetCertificateResponseBodyCertificate getCertificate() {
        return this.certificate;
    }

    public GetCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetCertificateResponseBodyCertificate extends TeaModel {
        /**
         * <p>The time when the certificate file was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1730217600000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the user who created the certificate file.</p>
         * 
         * <strong>example:</strong>
         * <p>1107550004253538</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a file</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The size of the certificate file, in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>77549</p>
         */
        @NameInMap("FileSizeInBytes")
        public Long fileSizeInBytes;

        /**
         * <p>The ID of the certificate file.</p>
         * 
         * <strong>example:</strong>
         * <p>676303114031776</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the certificate file.</p>
         * 
         * <strong>example:</strong>
         * <p>ca1.crt</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the workspace to which the certificate file belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>177161</p>
         */
        @NameInMap("ProjectId")
        public Long projectId;

        public static GetCertificateResponseBodyCertificate build(java.util.Map<String, ?> map) throws Exception {
            GetCertificateResponseBodyCertificate self = new GetCertificateResponseBodyCertificate();
            return TeaModel.build(map, self);
        }

        public GetCertificateResponseBodyCertificate setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetCertificateResponseBodyCertificate setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public GetCertificateResponseBodyCertificate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCertificateResponseBodyCertificate setFileSizeInBytes(Long fileSizeInBytes) {
            this.fileSizeInBytes = fileSizeInBytes;
            return this;
        }
        public Long getFileSizeInBytes() {
            return this.fileSizeInBytes;
        }

        public GetCertificateResponseBodyCertificate setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCertificateResponseBodyCertificate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCertificateResponseBodyCertificate setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

    }

}
