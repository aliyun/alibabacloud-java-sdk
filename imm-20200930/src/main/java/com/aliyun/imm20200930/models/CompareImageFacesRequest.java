// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CompareImageFacesRequest extends TeaModel {
    /**
     * <p><strong>If you have no special requirements, leave this parameter empty.</strong></p>
     * <p>The configurations of authorization chains. This parameter is optional. For more information, see <a href="https://help.aliyun.com/document_detail/465340.html">Use authorization chains to access resources of other entities</a>.</p>
     */
    @NameInMap("CredentialConfig")
    public CredentialConfig credentialConfig;

    /**
     * <p>The name of the project. For more information, see <a href="https://help.aliyun.com/document_detail/478153.html">CreateProject</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The URLs of the two images for compression.</p>
     */
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
         * <p>The OSS URL of the image file.</p>
         * <p>Specify the URL in the <code>oss://&lt;bucket&gt;/&lt;object&gt;</code> format. <code>&lt;bucket&gt;</code> specifies the name of the OSS bucket that is in the same region as the current project. <code>&lt;object&gt;</code> specifies path of the object with the extension included.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/test-object1</p>
         */
        @NameInMap("URI1")
        public String URI1;

        /**
         * <p>The OSS URL of the image file.</p>
         * <p>Specify the URL in the <code>oss://&lt;bucket&gt;/&lt;object&gt;</code> format. <code>&lt;bucket&gt;</code> specifies the name of the OSS bucket that is in the same region as the current project, and <code>&lt;object&gt;</code> specifies the path of the object with the extension included.</p>
         * 
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
