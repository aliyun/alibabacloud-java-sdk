// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class RegisterMediaDetailPersonResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RegisteredPersonages")
    public RegisterMediaDetailPersonResponseBodyRegisteredPersonages registeredPersonages;

    @NameInMap("FailedImages")
    public RegisterMediaDetailPersonResponseBodyFailedImages failedImages;

    public static RegisterMediaDetailPersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterMediaDetailPersonResponseBody self = new RegisterMediaDetailPersonResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterMediaDetailPersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterMediaDetailPersonResponseBody setRegisteredPersonages(RegisterMediaDetailPersonResponseBodyRegisteredPersonages registeredPersonages) {
        this.registeredPersonages = registeredPersonages;
        return this;
    }
    public RegisterMediaDetailPersonResponseBodyRegisteredPersonages getRegisteredPersonages() {
        return this.registeredPersonages;
    }

    public RegisterMediaDetailPersonResponseBody setFailedImages(RegisterMediaDetailPersonResponseBodyFailedImages failedImages) {
        this.failedImages = failedImages;
        return this;
    }
    public RegisterMediaDetailPersonResponseBodyFailedImages getFailedImages() {
        return this.failedImages;
    }

    public static class RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile build(java.util.Map<String, ?> map) throws Exception {
            RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile self = new RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile();
            return TeaModel.build(map, self);
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage extends TeaModel {
        @NameInMap("Quality")
        public String quality;

        @NameInMap("ImageFile")
        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile imageFile;

        @NameInMap("PersonName")
        public String personName;

        @NameInMap("Gender")
        public String gender;

        @NameInMap("FaceId")
        public String faceId;

        @NameInMap("Target")
        public String target;

        @NameInMap("ImageId")
        public String imageId;

        public static RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage build(java.util.Map<String, ?> map) throws Exception {
            RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage self = new RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage();
            return TeaModel.build(map, self);
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage setQuality(String quality) {
            this.quality = quality;
            return this;
        }
        public String getQuality() {
            return this.quality;
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage setImageFile(RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile imageFile) {
            this.imageFile = imageFile;
            return this;
        }
        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonageImageFile getImageFile() {
            return this.imageFile;
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage setPersonName(String personName) {
            this.personName = personName;
            return this;
        }
        public String getPersonName() {
            return this.personName;
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage setFaceId(String faceId) {
            this.faceId = faceId;
            return this;
        }
        public String getFaceId() {
            return this.faceId;
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public RegisterMediaDetailPersonResponseBodyRegisteredPersonagesRegisteredPersonage setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
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

    public static class RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile build(java.util.Map<String, ?> map) throws Exception {
            RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile self = new RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile();
            return TeaModel.build(map, self);
        }

        public RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class RegisterMediaDetailPersonResponseBodyFailedImagesFailedImage extends TeaModel {
        @NameInMap("ImageFile")
        public RegisterMediaDetailPersonResponseBodyFailedImagesFailedImageImageFile imageFile;

        @NameInMap("Success")
        public String success;

        @NameInMap("Code")
        public String code;

        public static RegisterMediaDetailPersonResponseBodyFailedImagesFailedImage build(java.util.Map<String, ?> map) throws Exception {
            RegisterMediaDetailPersonResponseBodyFailedImagesFailedImage self = new RegisterMediaDetailPersonResponseBodyFailedImagesFailedImage();
            return TeaModel.build(map, self);
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

        public RegisterMediaDetailPersonResponseBodyFailedImagesFailedImage setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
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

}
