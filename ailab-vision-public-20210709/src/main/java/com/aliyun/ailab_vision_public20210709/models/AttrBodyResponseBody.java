// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709.models;

import com.aliyun.tea.*;

public class AttrBodyResponseBody extends TeaModel {
    @NameInMap("success")
    public Long success;

    @NameInMap("errmsg")
    public String errmsg;

    @NameInMap("attributes")
    public java.util.List<AttrBodyResponseBodyAttributes> attributes;

    @NameInMap("valid")
    public java.util.List<Long> valid;

    public static AttrBodyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttrBodyResponseBody self = new AttrBodyResponseBody();
        return TeaModel.build(map, self);
    }

    public AttrBodyResponseBody setSuccess(Long success) {
        this.success = success;
        return this;
    }
    public Long getSuccess() {
        return this.success;
    }

    public AttrBodyResponseBody setErrmsg(String errmsg) {
        this.errmsg = errmsg;
        return this;
    }
    public String getErrmsg() {
        return this.errmsg;
    }

    public AttrBodyResponseBody setAttributes(java.util.List<AttrBodyResponseBodyAttributes> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.List<AttrBodyResponseBodyAttributes> getAttributes() {
        return this.attributes;
    }

    public AttrBodyResponseBody setValid(java.util.List<Long> valid) {
        this.valid = valid;
        return this;
    }
    public java.util.List<Long> getValid() {
        return this.valid;
    }

    public static class AttrBodyResponseBodyAttributes extends TeaModel {
        @NameInMap("gender")
        public String gender;

        @NameInMap("genderScore")
        public Float genderScore;

        @NameInMap("age")
        public String age;

        @NameInMap("ageScore")
        public Float ageScore;

        @NameInMap("direction")
        public String direction;

        @NameInMap("directionScore")
        public Float directionScore;

        @NameInMap("quality")
        public Float quality;

        public static AttrBodyResponseBodyAttributes build(java.util.Map<String, ?> map) throws Exception {
            AttrBodyResponseBodyAttributes self = new AttrBodyResponseBodyAttributes();
            return TeaModel.build(map, self);
        }

        public AttrBodyResponseBodyAttributes setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public AttrBodyResponseBodyAttributes setGenderScore(Float genderScore) {
            this.genderScore = genderScore;
            return this;
        }
        public Float getGenderScore() {
            return this.genderScore;
        }

        public AttrBodyResponseBodyAttributes setAge(String age) {
            this.age = age;
            return this;
        }
        public String getAge() {
            return this.age;
        }

        public AttrBodyResponseBodyAttributes setAgeScore(Float ageScore) {
            this.ageScore = ageScore;
            return this;
        }
        public Float getAgeScore() {
            return this.ageScore;
        }

        public AttrBodyResponseBodyAttributes setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public AttrBodyResponseBodyAttributes setDirectionScore(Float directionScore) {
            this.directionScore = directionScore;
            return this;
        }
        public Float getDirectionScore() {
            return this.directionScore;
        }

        public AttrBodyResponseBodyAttributes setQuality(Float quality) {
            this.quality = quality;
            return this;
        }
        public Float getQuality() {
            return this.quality;
        }

    }

}
