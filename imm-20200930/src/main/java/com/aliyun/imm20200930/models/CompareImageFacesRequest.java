// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CompareImageFacesRequest extends TeaModel {
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("Source")
    public CompareImageFacesRequestSource source;

    public static CompareImageFacesRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareImageFacesRequest self = new CompareImageFacesRequest();
        return TeaModel.build(map, self);
    }

    public CompareImageFacesRequest setCredentialConfig(CredentialConfig credentialConfig) {
        this.credentialConfig = credentialConfig;
        return this;
    }
    public CredentialConfig getCredentialConfig() {
        return this.credentialConfig;
    }

    public CompareImageFacesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CompareImageFacesRequest setSource(CompareImageFacesRequestSource source) {
        this.source = source;
        return this;
    }
    public CompareImageFacesRequestSource getSource() {
        return this.source;
    }

    public static class CompareImageFacesRequestSource extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object1</p>
         */
        @NameInMap("URI1")
        public String URI1;

        /**
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object2</p>
         */
        @NameInMap("URI2")
        public String URI2;

        public static CompareImageFacesRequestSource build(java.util.Map<String, ?> map) throws Exception {
            CompareImageFacesRequestSource self = new CompareImageFacesRequestSource();
            return TeaModel.build(map, self);
        }

        public CompareImageFacesRequestSource setURI1(String URI1) {
            this.URI1 = URI1;
            return this;
        }
        public String getURI1() {
            return this.URI1;
        }

        public CompareImageFacesRequestSource setURI2(String URI2) {
            this.URI2 = URI2;
            return this;
        }
        public String getURI2() {
            return this.URI2;
        }

    }

}
