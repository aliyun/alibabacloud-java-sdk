// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudphone20201230.models;

import com.aliyun.tea.*;

public class DeleteImagesResponseBody extends TeaModel {
    /**
     * <p>Details about images that are deleted.</p>
     */
    @NameInMap("ImageResponses")
    public DeleteImagesResponseBodyImageResponses imageResponses;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteImagesResponseBody self = new DeleteImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteImagesResponseBody setImageResponses(DeleteImagesResponseBodyImageResponses imageResponses) {
        this.imageResponses = imageResponses;
        return this;
    }
    public DeleteImagesResponseBodyImageResponses getImageResponses() {
        return this.imageResponses;
    }

    public DeleteImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DeleteImagesResponseBodyImageResponsesImageResponse extends TeaModel {
        /**
         * <p>The HTTP status code that is returned when the image is deleted.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The ID of the image that is requested for deletion.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The message that is returned when the image is deleted.</p>
         */
        @NameInMap("Message")
        public String message;

        public static DeleteImagesResponseBodyImageResponsesImageResponse build(java.util.Map<String, ?> map) throws Exception {
            DeleteImagesResponseBodyImageResponsesImageResponse self = new DeleteImagesResponseBodyImageResponsesImageResponse();
            return TeaModel.build(map, self);
        }

        public DeleteImagesResponseBodyImageResponsesImageResponse setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DeleteImagesResponseBodyImageResponsesImageResponse setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DeleteImagesResponseBodyImageResponsesImageResponse setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DeleteImagesResponseBodyImageResponses extends TeaModel {
        @NameInMap("ImageResponse")
        public java.util.List<DeleteImagesResponseBodyImageResponsesImageResponse> imageResponse;

        public static DeleteImagesResponseBodyImageResponses build(java.util.Map<String, ?> map) throws Exception {
            DeleteImagesResponseBodyImageResponses self = new DeleteImagesResponseBodyImageResponses();
            return TeaModel.build(map, self);
        }

        public DeleteImagesResponseBodyImageResponses setImageResponse(java.util.List<DeleteImagesResponseBodyImageResponsesImageResponse> imageResponse) {
            this.imageResponse = imageResponse;
            return this;
        }
        public java.util.List<DeleteImagesResponseBodyImageResponsesImageResponse> getImageResponse() {
            return this.imageResponse;
        }

    }

}
