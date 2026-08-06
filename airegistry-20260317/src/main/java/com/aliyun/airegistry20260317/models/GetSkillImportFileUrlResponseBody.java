// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airegistry20260317.models;

import com.aliyun.tea.*;

public class GetSkillImportFileUrlResponseBody extends TeaModel {
    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Data")
    public GetSkillImportFileUrlResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9E87E66-9EF0-5C10-A5E6-924020A0C9B7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSkillImportFileUrlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillImportFileUrlResponseBody self = new GetSkillImportFileUrlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillImportFileUrlResponseBody setData(GetSkillImportFileUrlResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillImportFileUrlResponseBodyData getData() {
        return this.data;
    }

    public GetSkillImportFileUrlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSkillImportFileUrlResponseBodyData extends TeaModel {
        /**
         * <p>The file type.</p>
         * 
         * <strong>example:</strong>
         * <p>application/zip</p>
         */
        @NameInMap("ContentType")
        public String contentType;

        /**
         * <p>The maximum size of the file that can be uploaded, in MB.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("MaxSize")
        public String maxSize;

        /**
         * <p>The file name in the authorized OSS bucket.</p>
         * <blockquote>
         * <p>You can use one of the following methods to pass in images: FaceContrastPicture, FaceContrastPictureUrl, CertifyId, or OSS. Select one of these methods.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1190239587066411/skill/import/5e993afe-f629-4619-9ac2-51b125300cdd/2026/06/09/35059076-5992-4a71-a706-89230e57f2a2/ui-ux-pro-max.zip</p>
         */
        @NameInMap("OssObjectName")
        public String ossObjectName;

        /**
         * <p>The file upload URL. The client uses this URL to upload the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://mse-shared-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/skill/import/199xxxxxxxx0842/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxx/2026/06/10/xxxx-xxxx-xxxx-xxxx-xxxxxxxxxx/1781082579097.zip?Expires=1781083479&OSSAccessKeyId=STS.NZXGXTD2yoDLd5PfsYxjFrvBJ&Signature=Loyyzzzzzzzz%3D&security-token=CAIStgxxxxxxx">https://mse-shared-cn-hangzhou.oss-cn-hangzhou.aliyuncs.com/skill/import/199xxxxxxxx0842/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxx/2026/06/10/xxxx-xxxx-xxxx-xxxx-xxxxxxxxxx/1781082579097.zip?Expires=1781083479&amp;OSSAccessKeyId=STS.NZXGXTD2yoDLd5PfsYxjFrvBJ&amp;Signature=Loyyzzzzzzzz%3D&amp;security-token=CAIStgxxxxxxx</a></p>
         */
        @NameInMap("UploadUrl")
        public String uploadUrl;

        public static GetSkillImportFileUrlResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillImportFileUrlResponseBodyData self = new GetSkillImportFileUrlResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillImportFileUrlResponseBodyData setContentType(String contentType) {
            this.contentType = contentType;
            return this;
        }
        public String getContentType() {
            return this.contentType;
        }

        public GetSkillImportFileUrlResponseBodyData setMaxSize(String maxSize) {
            this.maxSize = maxSize;
            return this;
        }
        public String getMaxSize() {
            return this.maxSize;
        }

        public GetSkillImportFileUrlResponseBodyData setOssObjectName(String ossObjectName) {
            this.ossObjectName = ossObjectName;
            return this;
        }
        public String getOssObjectName() {
            return this.ossObjectName;
        }

        public GetSkillImportFileUrlResponseBodyData setUploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }
        public String getUploadUrl() {
            return this.uploadUrl;
        }

    }

}
