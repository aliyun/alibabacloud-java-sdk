// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709.models;

import com.aliyun.tea.*;

public class AttrFaceResponseBody extends TeaModel {
    @NameInMap("success")
    public Long success;

    @NameInMap("errmsg")
    public String errmsg;

    @NameInMap("attributes")
    public java.util.List<AttrFaceResponseBodyAttributes> attributes;

    @NameInMap("valid")
    public java.util.List<Long> valid;

    public static AttrFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttrFaceResponseBody self = new AttrFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public AttrFaceResponseBody setSuccess(Long success) {
        this.success = success;
        return this;
    }
    public Long getSuccess() {
        return this.success;
    }

    public AttrFaceResponseBody setErrmsg(String errmsg) {
        this.errmsg = errmsg;
        return this;
    }
    public String getErrmsg() {
        return this.errmsg;
    }

    public AttrFaceResponseBody setAttributes(java.util.List<AttrFaceResponseBodyAttributes> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<AttrFaceResponseBodyAttributes> getAttributes() {
        return this.attributes;
    }

    public AttrFaceResponseBody setValid(java.util.List<Long> valid) {
        this.valid = valid;
        return this;
    }
    public java.util.List<Long> getValid() {
        return this.valid;
    }

    public static class AttrFaceResponseBodyAttributes extends TeaModel {
        @NameInMap("age")
        public Float age;

        @NameInMap("ageScore")
        public Float ageScore;

        @NameInMap("gender")
        public String gender;

        @NameInMap("genderScore")
        public Float genderScore;

        @NameInMap("mask")
        public String mask;

        @NameInMap("angle")
        public java.util.List<Float> angle;

        @NameInMap("score")
        public Float score;

        public static AttrFaceResponseBodyAttributes build(java.util.Map<String, ?> map) throws Exception {
            AttrFaceResponseBodyAttributes self = new AttrFaceResponseBodyAttributes();
            return TeaModel.build(map, self);
        }

        public AttrFaceResponseBodyAttributes setAge(Float age) {
            this.age = age;
            return this;
        }
        public Float getAge() {
            return this.age;
        }

        public AttrFaceResponseBodyAttributes setAgeScore(Float ageScore) {
            this.ageScore = ageScore;
            return this;
        }
        public Float getAgeScore() {
            return this.ageScore;
        }

        public AttrFaceResponseBodyAttributes setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public AttrFaceResponseBodyAttributes setGenderScore(Float genderScore) {
            this.genderScore = genderScore;
            return this;
        }
        public Float getGenderScore() {
            return this.genderScore;
        }

        public AttrFaceResponseBodyAttributes setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public AttrFaceResponseBodyAttributes setAngle(java.util.List<Float> angle) {
            this.angle = angle;
            return this;
        }
        public java.util.List<Float> getAngle() {
            return this.angle;
        }

        public AttrFaceResponseBodyAttributes setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

}
