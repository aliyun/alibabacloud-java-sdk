// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class RegisterMediaDetailPersonResponseBody extends TeaModel {
    @NameInMap("FailedImages")
    public RegisterMediaDetailPersonResponseBodyFailedImages failedImages;

    @NameInMap("RegisteredPersonages")
    public RegisterMediaDetailPersonResponseBodyRegisteredPersonages registeredPersonages;

    @NameInMap("RequestId")
    public String requestId;

    public static RegisterMediaDetailPersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaDetailPersonResponseBody self = new RegisterMediaDetailPersonResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterMediaDetailPersonResponseBody setFailedImages(RegisterMediaDetailPersonResponseBodyFailedImages failedImages) {
        this.failedImages = failedImages;
        return this;
    }
    public RegisterMediaDetailPersonResponseBodyFailedImages getFailedImages() {
        return this.failedImages;
    }

    public RegisterMediaDetailPersonResponseBody setRegisteredPersonages(RegisterMediaDetailPersonResponseBodyRegisteredPersonages registeredPersonages) {
        this.registeredPersonages = registeredPersonages;
        return this;
    }
    public RegisterMediaDetailPersonResponseBodyRegisteredPersonages getRegisteredPersonages() {
        return this.registeredPersonages;
    }

    public RegisterMediaDetailPersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile build(java.util.Map<String, ?> map) throws Exception {
            RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile self = new RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile();
            return TeaModel.build(map, self);
        }

        public RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class RegisterMediaDetailPersonResponseBodyFailedImagesFailedImage extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("ImageFile")
        public RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile imageFile;

        @NameInMap("Success")
        public String success;

        public static RegisterMediaDetailPersonResponseBodyFailedImagesFailedImage build(java.util.Map<String, ?> map) throws Exception {
            RegisterMediaDetailPersonResponseBodyFailedImagesFailedImage self = new RegisterMediaDetailPersonResponseBodyFailedImagesFailedImage();
            return TeaModel.build(map, self);
        }

        public RegisterMediaDetailPersonResponseBodyFailedImagesFailedImage setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RegisterMediaDetailPersonResponseBodyFailedImagesFailedImage setImageFile(RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile imageFile) {
            this.imageFile = imageFile;
            return this;
        }
        public RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile getImageFile() {
            return this.imageFile;
        }

        public RegisterMediaDetailPersonResponseBodyFailedImagesFailedImage setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

    public static class RegisterMediaDetailPersonResponseBodyFailedImages extends TeaModel {
        @NameInMap("FailedImage")
        public java.util.List<RegisterMediaDetailPersonResponseBodyFailedImagesFailedImage> failedImage;

        public static RegisterMediaDetailPersonResponseBodyFailedImages build(java.util.Map<String, ?> map) throws Exception {
            RegisterMediaDetailPersonResponseBodyFailedImages self = new RegisterMediaDetailPersonResponseBodyFailedImages();
            return TeaModel.build(map, self);
        }

        public RegisterMediaDetailPersonResponseBodyFailedImages setFailedImage(java.util.List<RegisterMediaDetailPersonResponseBodyFailedImagesFailedImage> failedImage) {
            this.failedImage = failedImage;
            return this;
        }
        public java.util.List<RegisterMediaDetailPersonResponseBodyFailedImagesFailedImage> getFailedImage() {
            return this.failedImage;
        }

    }

    public static class RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile build(java.util.Map<String, ?> map) throws Exception {
            RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile self = new RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile();
            return TeaModel.build(map, self);
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage extends TeaModel {
        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("ImageFile")
        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile imageFile;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("PersonName")
        public String personName;

        @NameInMap("Quality")
        public String quality;

        @NameInMap("Target")
        public String target;

        public static RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage build(java.util.Map<String, ?> map) throws Exception {
            RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage self = new RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage();
            return TeaModel.build(map, self);
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage setImageFile(RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile imageFile) {
            this.imageFile = imageFile;
            return this;
        }
        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile getImageFile() {
            return this.imageFile;
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage setPersonName(String personName) {
            this.personName = personName;
            return this;
        }
        public String getPersonName() {
            return this.personName;
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage setQuality(String quality) {
            this.quality = quality;
            return this;
        }
        public String getQuality() {
            return this.quality;
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class RegisterMediaDetailPersonResponseBodyRegisteredPersonages extends TeaModel {
        @NameInMap("RegisteredPersonage")
        public java.util.List<RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage> registeredPersonage;

        public static RegisterMediaDetailPersonResponseBodyRegisteredPersonages build(java.util.Map<String, ?> map) throws Exception {
            RegisterMediaDetailPersonResponseBodyRegisteredPersonages self = new RegisterMediaDetailPersonResponseBodyRegisteredPersonages();
            return TeaModel.build(map, self);
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonages setRegisteredPersonage(java.util.List<RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage> registeredPersonage) {
            this.registeredPersonage = registeredPersonage;
            return this;
        }
        public java.util.List<RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage> getRegisteredPersonage() {
            return this.registeredPersonage;
        }

    }

}
