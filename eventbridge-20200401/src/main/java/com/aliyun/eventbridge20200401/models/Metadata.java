// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class Metadata extends TeaModel {
    @NameInMap("Attachments")
    public java.util.List<MetadataAttachments> attachments;

    public static Metadata build(java.util.Map<String, ?> map) throws Exception {
        Metadata self = new Metadata();
        return TeaModel.build(map, self);
    }

    public Metadata setAttachments(java.util.List<MetadataAttachments> attachments) {
        this.attachments = attachments;
        return this;
    }
    public java.util.List<MetadataAttachments> getAttachments() {
        return this.attachments;
    }

    public static class MetadataAttachments extends TeaModel {
        @NameInMap("Arn")
        public String arn;

        @NameInMap("MimeType")
        public String mimeType;

        public static MetadataAttachments build(java.util.Map<String, ?> map) throws Exception {
            MetadataAttachments self = new MetadataAttachments();
            return TeaModel.build(map, self);
        }

        public MetadataAttachments setArn(String arn) {
            this.arn = arn;
            return this;
        }
        public String getArn() {
            return this.arn;
        }

        public MetadataAttachments setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }
        public String getMimeType() {
            return this.mimeType;
        }

    }

}
