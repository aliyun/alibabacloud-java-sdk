// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Car extends TeaModel {
    @NameInMap("Boundary")
    public Boundary boundary;

    @NameInMap("CarColor")
    public String carColor;

    @NameInMap("CarColorConfidence")
    public Double carColorConfidence;

    @NameInMap("CarType")
    public String carType;

    @NameInMap("CarTypeConfidence")
    public Double carTypeConfidence;

    @NameInMap("Confidence")
    public Double confidence;

    @NameInMap("LicensePlates")
    public java.util.List<LicensePlate> licensePlates;

    public static Car build(java.util.Map<String, ?> map) throws Exception {
        Car self = new Car();
        return TeaModel.build(map, self);
    }

    public Car setBoundary(Boundary boundary) {
        this.boundary = boundary;
        return this;
    }
    public Boundary getBoundary() {
        return this.boundary;
    }

    public Car setCarColor(String carColor) {
        this.carColor = carColor;
        return this;
    }
    public String getCarColor() {
        return this.carColor;
    }

    public Car setCarColorConfidence(Double carColorConfidence) {
        this.carColorConfidence = carColorConfidence;
        return this;
    }
    public Double getCarColorConfidence() {
        return this.carColorConfidence;
    }

    public Car setCarType(String carType) {
        this.carType = carType;
        return this;
    }
    public String getCarType() {
        return this.carType;
    }

    public Car setCarTypeConfidence(Double carTypeConfidence) {
        this.carTypeConfidence = carTypeConfidence;
        return this;
    }
    public Double getCarTypeConfidence() {
        return this.carTypeConfidence;
    }

    public Car setConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }
    public Double getConfidence() {
        return this.confidence;
    }

    public Car setLicensePlates(java.util.List<LicensePlate> licensePlates) {
        this.licensePlates = licensePlates;
        return this;
    }
    public java.util.List<LicensePlate> getLicensePlates() {
        return this.licensePlates;
    }

}
